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
.el-header {
  float: left;
  width: 100%;
  background-color: #B3C0D1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-main {
  height: 100%;
  background-color: #E9EEF3;
  color: #333;
  text-align: center;
  line-height: 160px;
  padding: 0;
}

.el-container {
  margin-bottom: 40px;
  height: 100%;
}

</style>