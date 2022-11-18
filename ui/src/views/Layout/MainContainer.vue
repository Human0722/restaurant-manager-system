<template>
  <el-row>
    <el-col :span="8">
      <div class="main-left">
        <div class="time">{{time}}</div>
        <div class="date">{{date}}</div>
        <div class="user-info">{{userInfo}}</div>
        <div class="ticket-info">
          <div class="ticket-info-left">
            <span class="ticket-info-title">未结账订单</span><br>
            <span class="ticket-info-value">2</span>
          </div>
          <div class="ticket-info-right">
            <span class="ticket-info-title">待支付金额( 元 )</span><br>
            <span class="ticket-info-value">785</span>
          </div>
        </div>
      </div>
    </el-col>
    <el-col :span="16">
      <div class="main-right">
        <el-row>
          <el-col :span="20">
            <div class="table-item"></div>
            <div class="table-item"></div>
            <div class="table-item"></div>
            <div class="table-item"></div>
            <div class="table-item"></div>
            <div class="table-item"></div>
          </el-col>
          <el-col :span="4">
            <el-menu default-active="1-4-1" class="el-menu-vertical-demo" :collapse="isCollapse">
              <el-submenu index="1">
                <template slot="title">
                  <i class="el-icon-location"></i>
                  <span slot="title">导航一</span>
                </template>
                <el-menu-item-group>
                  <span slot="title">分组一</span>
                  <el-menu-item index="1-1">选项1</el-menu-item>
                  <el-menu-item index="1-2">选项2</el-menu-item>
                </el-menu-item-group>
                <el-menu-item-group title="分组2">
                  <el-menu-item index="1-3">选项3</el-menu-item>
                </el-menu-item-group>
                <el-submenu index="1-4">
                  <span slot="title">选项4</span>
                  <el-menu-item index="1-4-1">选项1</el-menu-item>
                </el-submenu>
              </el-submenu>
              <el-menu-item index="2">
                <i class="el-icon-menu"></i>
                <span slot="title">导航二</span>
              </el-menu-item>
              <el-menu-item index="3" disabled>
                <i class="el-icon-document"></i>
                <span slot="title">导航三</span>
              </el-menu-item>
              <el-menu-item index="4">
                <i class="el-icon-setting"></i>
                <span slot="title">导航四</span>
              </el-menu-item>
            </el-menu>
          </el-col>
        </el-row>
      </div>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: "MainContainer",
  data() {
    return {
      dayDict: ['日', '一', '二', '三', '四', '五', '六'],
      time: '',
      date: '',
      userInfo: '海底捞 abdlke/3333',
      isCollapse: true
    }
  },
  methods: {

  },
  mounted() {
    setInterval(()=>{
      let date = new Date();
      let second = date.getSeconds();
      second = second < 10 ? '0' + second : second;
      let minute = date.getMinutes();
      minute = minute < 10 ? '0' + minute : minute;
      let hour = date.getHours();

      this.time = hour + ":" + minute + ":" + second;
      this.date = date.getMonth() + "月" + date.getDate() + "日 星期" + this.dayDict[date.getDay()];
    }, 1000);
  }
}
</script>

<style scoped>
  .el-row, .el-col, .main-right, .main-left {
    height: 100%;
  }
  .main-left {
    background-image: url("/public/img.png");
    display: flex;
    flex-direction: column;
    justify-content: center;
  }
  .ticket-info {
    margin-top: 3rem;
    display: flex;
    flex-direction: row;
    justify-content: center;
  }
  .ticket-info-left {
    border-right: solid darkgray 1px;
  }

  .time {
    font-size: 4rem;
  }

  .ticket-info-title {
    color: #d9d9d9;
    font-family: 黑体;
    font-size: 1.5rem;
  }
  .ticket-info-value {
    color: red;
    font-size: 2rem;
  }
</style>
