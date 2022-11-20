<template>
  <div class="slf-header-middle">
    <div><span><i class="el-icon-search"></i></span></div>
    <div><span>1</span></div>
    <div><span>2</span></div>
    <div><span>3</span></div>
    <div><span>4</span></div>
    <div><span>5</span></div>
  </div>
</template>

<script>
export default {
  name: "HeaderMiddleComponent"
}
</script>

<style scoped>
  .slf-header-middle {

    display: flex;

    justify-content: space-between;
    align-items: center;
    font-size: 2rem;
  }
  .slf-header-middle {
    display: flex;
    justify-content: space-around;
  }
  .slf-header-middle>div {
    margin-right: 2rem;
  }
</style>
