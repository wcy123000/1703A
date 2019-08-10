
$(function () {
	$(function(){
	      $('.page-link').click(function (e) {
	      	  //获取点击的的url
	          var url = $(this).attr('data');
	      
	         //在中间区域显示地址的内容
	         $('#content-wrapper').load(url);
	      });
		
	})
       $('ul li').click(function () {
    	   //获取当前默认高亮的属性
         var li = $('ul li.active');
    	   //移除目前高亮的样式
            li.removeClass('active');
    	   //为当前点击行添加高亮的样式
            $(this).addClass('active');
    	   
        });  
       <!--当点击左侧菜单时-->
        $('.nav-link').click(function (e) {
        	  //获取点击的的url
            var url = $(this).attr('data');
        	 // alert(url)
           // console.log(url);
           //在中间区域显示地址的内容
           
            $('#content-wrapper').load(url);
        });
})