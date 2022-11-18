<template>
  <el-container>
    <el-header>
      <HeaderComponent/>
    </el-header>
    <el-main>
      <MainContainer/>
    </el-main>
  </el-container>
</template>

<script>
import HeaderComponent from "@/views/Layout/HeaderComponent";
import MainContainer from "@/views/Layout/MainContainer";
export default {
  name: "FrameWorkComponent",
  components: {
    HeaderComponent,
    MainContainer
  }
}
</script>
<style scoped>
.el-container {
  height: 100%;
  display: flex;
  flex-direction: column;
}
.el-main {
  flex: 1;
  background-color: #d9d9d9;
}
</style>