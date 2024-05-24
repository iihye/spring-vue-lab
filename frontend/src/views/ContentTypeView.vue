<template>
    <HomeButton />

    <div class="contenttypeview-main-container">
        <div class="contenttypeview-sub-title">Content-type</div>

        <!-- 1. application/json -->
        <div class="contenttypeview-item-title">1. application/json</div>
        <div>content-type: {{ jsonType }}</div>
        <div>data: {{ jsonData }}</div>
        <button class="contenttypeview-item-button" @click="postJson">
            check
        </button>

        <!-- 2. application/x-www-form-urlencode -->
        <div class="contenttypeview-item-title">
            2. application/x-www-form-urlencode
        </div>
        <div>content-type: {{ urlencodedType }}</div>
        <div>data: {{ urlencodedData }}</div>
        <button class="contenttypeview-item-button" @click="postUrlencode">
            check
        </button>

        <!-- 3. multipart/form-data -->
        <div class="contenttypeview-item-title">3. multipart/form-data</div>
        <div>content-type: {{ formType }}</div>
        <div>data: {{ formData }}</div>
        <button class="contenttypeview-item-button" @click="postForm">
            check
        </button>
    </div>
</template>

<script setup>
import { ref } from "vue";
import HomeButton from "@/components/main/HomeButton.vue";
import axios from "axios";
import qs from "qs";

const jsonData = ref("");
const jsonType = ref("");
const urlencodedData = ref("");
const urlencodedType = ref("");
const formData = ref("");
const formType = ref("");

const data = {
    name: "John Mayer",
    age: 30,
};

const postJson = async () => {
    const response = await axios.post(
        "http://localhost:8080/content-type/json",
        data
    );

    jsonData.value = response.data;
    jsonType.value = response.config.headers["Content-Type"];
};

const postUrlencode = async () => {
    const response = await axios.post(
        "http://localhost:8080/content-type/urlencode",
        qs.stringify(data),
        {
            headers: {
                "Content-Type": "application/x-www-form-urlencoded",
            },
        }
    );

    urlencodedData.value = response.data;
    urlencodedType.value = response.config.headers["Content-Type"];
};

const postForm = async () => {
    const form = new FormData();
    form.append("name", "John Mayer");
    form.append("age", 30);

    const response = await axios.post(
        "http://localhost:8080/content-type/formdata",
        form,
        {
            headers: {
                "Content-Type": "multipart/form-data",
            },
        }
    );

    formData.value = response.data;
    formType.value = response.config.headers["Content-Type"];
};
</script>

<style scoped>
.contenttypeview-main-container {
    display: flex;
    flex-direction: column;
    height: 100%;
    padding: 2rem;
}

.contenttypeview-sub-title {
    font-size: 2rem;
    font-family: "Pretendard-ExtraBold";
    color: rgb(63, 63, 63);
    text-align: center;
    margin-bottom: 1rem;
}

.contenttypeview-item-title {
    font-size: 1.2rem;
    font-family: "Pretendard-Bold";
    color: rgb(40, 80, 255);
}

.contenttypeview-item-button {
    width: 6rem;
    height: 2rem;
    font-size: 1rem;
    background: rgba(119, 144, 255, 0.15);
    backdrop-filter: blur(4.5px);
    border: 1px solid rgba(255, 255, 255, 0.18);
    margin-bottom: 1rem;
}
</style>
