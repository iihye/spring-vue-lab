<template>
    <div class="homeview-main-container">
        <div class="homeview-main-title">Welcome!</div>
        <div class="homeview-sub-title">spring-vue-lab</div>

        <div class="homeview-route-container">
            <RouterLink to="/content-type">
                <button class="homeview-route-button">content-type</button>
            </RouterLink>
        </div>
    </div>
</template>

<script setup></script>

<style scoped>
.homeview-main-container {
    display: flex;
    flex-direction: column;
    align-items: center;
    height: 100vh;
    padding: 2rem;
}

.homeview-main-title {
    font-size: 4rem;
    font-family: "Pretendard-ExtraBold";
    background-image: linear-gradient(
        to right,
        rgb(184, 68, 93),
        rgb(255, 126, 126)
    );
    background-clip: text;
    -webkit-background-clip: text;
    color: transparent;
}

.homeview-sub-title {
    font-size: 2rem;
    font-family: "Pretendard-ExtraBold";
    color: rgb(63, 63, 63);
}

.homeview-route-container {
    padding: 2rem;
}

.homeview-route-button {
    width: 22rem;
    height: 3rem;
    font-size: 1rem;
    background: rgba(255, 255, 255, 0.15);
    backdrop-filter: blur(4.5px);
    box-shadow: 0 8px 32px 0 rgba(116, 117, 119, 0.37);
    border: 1px solid rgba(255, 255, 255, 0.18);
}
</style>
