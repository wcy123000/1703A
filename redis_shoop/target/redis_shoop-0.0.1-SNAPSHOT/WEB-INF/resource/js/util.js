function clock(stopTime){
    var today=new Date(),// 当前时间
    h=today.getHours(),
    m=today.getMinutes(),
    s=today.getSeconds();
    
    stopH=stopTime.getHours(),
    stopM=stopTime.getMinutes(),
    stopS=stopTime.getSeconds();

    var shenyu=stopTime.getTime()-today.getTime(),// 倒计时毫秒数
    shengyuD=parseInt(shenyu/(60*60*24*1000)),// 转换为天
    D=parseInt(shenyu)-parseInt(shengyuD*60*60*24*1000),// 除去天的毫秒数
    shengyuH=parseInt(D/(60*60*1000)),// 除去天的毫秒数转换成小时
    H=D-shengyuH*60*60*1000,// 除去天、小时的毫秒数
    shengyuM=parseInt(H/(60*1000)),// 除去天的毫秒数转换成分钟
    M=H-shengyuM*60*1000;// 除去天、小时、分的毫秒数
    S=parseInt((shenyu-shengyuD*60*60*24*1000-shengyuH*60*60*1000-shengyuM*60*1000)/1000)// 除去天、小时、分的毫秒数转化为秒
   return shengyuD+"天"+shengyuH+"小时"+shengyuM+"分"+S+"秒";
    
}
/*
//开始时间
onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'2019-07-13 00:00:00',maxDate:'#F{$dp.$D(\'endTime\')}'})" />
//结束时间
onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'startTime\')}'})" /> */
