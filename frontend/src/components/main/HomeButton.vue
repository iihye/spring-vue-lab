<template>
    <RouterLink to="/">
        <button class="homebutton">Back</button>
    </RouterLink>
</template>

<script setup></script>

<style scoped>
.homebutton {
    width: 3rem;
    height: 3rem;
    font-size: 1rem;
    background: rgba(255, 255, 255, 0.15);
    backdrop-filter: blur(4.5px);
    box-shadow: 0 8px 32px 0 rgba(116, 117, 119, 0.37);
    border: 1px solid rgba(255, 255, 255, 0.18);
}
</style>
