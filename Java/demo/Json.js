
//JavaScript 物件寫法 
var point = new Object();
point.x = 3;
point.y = 4;
point.get = function() {
	alert(this.x+","+this.y);
};

//JSON 物件寫法
var point={"x":3, "y":4, "get":function() {
	alert(this.x+","+this.y);
}};

//這是取得物件
point.get();




//JSON 物件寫法 排版
var point={
	"x":3, 
	"y":4, 
	"get":function() {
		alert(this.x+","+this.y);
	}
};