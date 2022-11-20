<template>
  <div class="slf-main">
    <div class="slf-main-detail"></div>
    <div class="slf-main-operate"></div>
    <div class="slf-main-item"></div>
    <div class="slf-main-item-category"></div>
  </div>
</template>

<script>
export default {
  name: "MainComponent"
}
</script>

<style scoped>
  div {
    border: solid 1px red;
  }
  .slf-main {
    display: flex;
    flex-direction: row;
  }
</style>
