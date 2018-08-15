$(function($) {

	$('#btn07').click(function() {

		var url = "json/om";
		var data = {
			userName : "小",
			gender : 1
		};

		$.ajax({
			type : "POST",
			url : url,
			data : data,
			success : function(msg) {
				console.log(msg);
				var json = JSON.parse(msg);//将json格式的字符串，转换为JSON对象
				console.log(json);

			}
		});
	});

	$('#btn06').click(function() {

		var url = "json/six";
		var data = {
			userName : "小"
		};

		$.ajax({
			type : "POST",
			url : url,
			data : data,
			success : function(msg) {
				console.log(msg);
			}
		});
	});

	$('#btn05').click(function() {

		var url = "json/five";
		var data = {
			userName : "小",
			gender : 1
		};

		$.ajax({
			type : "POST",
			url : url,
			data : data,
			success : function(msg) {
				console.log(msg);
			}
		});
	});

	$('#btn04').click(function() {

		var url = "json/four";
		var data = {
			userName : "小",
			gender : 1
		};

		$.ajax({
			type : "POST",
			url : url,
			data : data,
			success : function(msg) {
				console.log(msg);
			}
		});
	});

	$('#btn03').click(function() {

		var url = "json/three";
		var user = {
			userName : "小明",
			loginName : "xiaoming",
			password : "123456",
			age : "23",
			gender : "1"
		};
		var user2 = {
			userName : "小狗",
			loginName : "xiaoming",
			password : "123456",
			age : "23",
			gender : "1"
		};
		var user3 = {
			userName : "小喵",
			loginName : "xiaoming",
			password : "123456",
			age : "23",
			gender : "0"
		};

		var users = [];
		users.push(user);
		users.push(user2);
		users.push(user3);

		// 将js对象转换成JsonArray对象
		var data = $.toJSON(users);

		$.ajax({
			type : "POST",
			url : url,
			contentType : "application/json",
			data : data,
			success : function(msg) {
				console.log(msg);
			}
		});
	});

	$('#btn02').click(function() {

		var url = "json/two";
		var data = {
			userName : "小明",
			loginName : "xiaoming",
			password : "123456",
			age : "23",
			gender : "1"
		};

		$.ajax({
			type : "POST",
			url : url,
			data : data,
			success : function(msg) {
				console.log(msg);
			}
		});
	});

	$('#btn01').click(function() {

		var url = "json/one";
		var user = {
			userName : "小明",
			loginName : "xiaoming",
			password : "123456",
			age : "23",
			gender : "1"
		};
		// 将js对象转换成JSON对象
		var data = $.toJSON(user);

		$.ajax({
			type : "POST",
			url : url,
			contentType : "application/json",
			data : data,
			success : function(msg) {
				console.log(msg);
			}
		});
	});

});