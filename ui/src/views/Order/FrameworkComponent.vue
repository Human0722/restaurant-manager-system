<template>
  <div class="slf-container">
    <div class="slf-header">
      <HeaderLeftComponent/>
      <HeaderMiddleComponent/>
      <HeaderRightComponent/>
    </div>
    <MainComponent/>
  </div>
</template>

<script>
import HeaderLeftComponent from "@/views/Order/HeaderLeftComponent";
import HeaderMiddleComponent from "@/views/Order/HeaderMiddleComponent";
import HeaderRightComponent from "@/views/Desktop/HeaderRightComponent";
import MainComponent from "@/views/Order/MainComponent";
export default {
  name: "FrameworkComponent",
  components: {
    HeaderLeftComponent,
    HeaderMiddleComponent,
    HeaderRightComponent,
    MainComponent
  }
}
</script>

<style scoped>
  .slf-container {
    height: 100%;
  }
  .slf-header {
    display: flex;
    justify-content: space-between;
    height: 4rem;
  }
</style>
