$(function($) {

	$('#btn01').click(function() {

		var url = "users/register06";
		var data = {
			userName : "小明",
			loginName : "xiaoming",
			password : "123456",
			age : "23",
			gender : "1"
		};

		$.ajax({
			   type: "POST",
			   url: url,
			   data: data,
			   success: function(msg){
			    console.log(msg);
			   }
			});
	});

});