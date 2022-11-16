<template>
<div class="main-container-container">
  <el-row>
    <el-col :span="8" style="height: 100%;">
      <div id="main-left">
        <div class="time">{{time}}</div>
        <div class="date">{{date}}</div>
        <div class="user-info">{{userInfo}}</div>
        <div class="ticket-info">
          <el-row :gutter="20">
            <el-col :span="6">
              <div  style="border-right: 1px solid #d9d9d9">
                <el-statistic  title="未结账订单">
                  <template slot="formatter">
                    456/2
                  </template>
                </el-statistic>
              </div>
            </el-col>
            <el-col :span="6">
              <div>
                <el-statistic  title="待支付金额">
                  <template slot="formatter">
                    456/2
                  </template>
                </el-statistic>
              </div>
            </el-col>
          </el-row>
        </div>
      </div>
    </el-col>
    <el-col :span="16">
      <div id="main-right">
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
</div>
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
      this.time = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();

      this.date = date.getMonth() + "月" + date.getDate() + "日 星期" + this.dayDict[date.getDay()];
    }, 1000);
  }
}
</script>

<style scoped>
  #main-left {
    background-image: url("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fup.enterdesk.com%2Fphoto%2F2008-3-18%2F200803181719402627.jpg&refer=http%3A%2F%2Fup.enterdesk.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1671178859&t=9021ebbc46dce4e0861cbd785c543519") ;
    border: solid red 1px;
    height: 100%;
  }

  #main-right {
    border: solid yellow 1px;
    background-color: #d9d9d9;
  }

  .table-item {
    display: inline-block;
    height: 120px;
    width: 120px;
    border: solid red 1px;
  }

  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }
  .main-container-container {
    height: 100%;
  }
  .el-row {
    display: flex;
    flex-wrap: wrap;
  }
</style>