<template>
  <el-row>
    <el-col :span="8">
      <div class="main-left">
        <div class="time">{{time}}</div>
        <div class="date">{{date}}</div>
        <div class="user-info">{{userInfo}}</div>
        <div class="ticket-info">
          <div class="ticket-info-left">
            <span class="ticket-info-title">未结账订单</span>
            <span class="ticket-info-value">2</span>
          </div>
          <div class="ticket-info-right">
            <span class="ticket-info-title">待支付金额( 元 )</span>
            <span class="ticket-info-value">785</span>
          </div>
        </div>
      </div>
    </el-col>
    <el-col :span="16">
      <div class="main-right">
        <div class="main-right-seat">
          <div class="seat-item seat-item-used">
            <span>1</span>
            <span>2/4</span>
          </div>
          <div class="seat-item">
            <span>2</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>3</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span>7</span>
            <span>0/0</span>
          </div>
          <div class="seat-item">
            <span><i class="el-icon-plus"></i></span>
            <span>添加桌台</span>
          </div>
        </div>
        <div class="main-right-menu">
          <div class="menu-item menu-item-selected">全部</div>
          <div class="menu-item">一楼</div>
          <div class="menu-item">二楼</div>
          <div class="menu-item">包间</div>
          <div class="menu-item">+ 区域</div>
        </div>
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
      hour = hour < 10 ? '0' + hour : hour;
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
    align-items: stretch;
    justify-content: center;
  }
  .ticket-info-left {
    border-right: solid darkgray 1px;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding-right: 2.5rem;
  }
  .ticket-info-right {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding-left: 2.5rem;
  }

  .time {
    font-size: 4rem;
  }

  .ticket-info-title {
  }
  .ticket-info-value {
    color: black;
    font-size: 2rem;
  }
  .main-right {
    display: flex;
    flex-direction: row;
  }
  .main-right-seat{
    flex: 0 0 90%;
    display: flex;
    flex-wrap: wrap;
    overflow: auto;
    align-content: flex-start;
  }
  .seat-item {
    background-color: white;
    box-sizing: border-box;
    aspect-ratio: 1 / 1;
    flex: 0 0 20%;
    border-left: 5px solid #d9d9d9;
    border-right: 5px solid #d9d9d9;
    border-bottom: 10px solid #d9d9d9;

    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding-left: 1rem;
  }
  .seat-item-used {
    background-color: gray;
  }
  .seat-item:last-of-type {
    justify-self: center;
    align-self: center;
  }
  .seat-item>span:nth-child(1) {
    font-size: 2rem;
  }
  .seat-item>span:nth-child(2) {
    font-size: 1rem;
  }
  .main-right-menu {
    flex: 0 0 10%;
    display: flex;
    flex-wrap: wrap;
    overflow: auto;
    flex-direction: column;
    background-color: white;
    align-items: stretch;
  }
  .el-menu {
    width: 100%;
  }
  .menu-item {
    background-color: white;
    box-sizing: border-box;
    font-size: 1.5rem;
    line-height: 5rem;
  }
  .menu-item-selected {
    color: lawngreen;
    background-color: gray;
  }
</style>
