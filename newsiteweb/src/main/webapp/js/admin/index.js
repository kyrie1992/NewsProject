/**
 * 后台登录事件
 */
function IsValidValue(val) {
    if (val=='undefined'||val==null||$.trim(val)==''){
       return true;
    }
    return false;
}


/**
 * 登录事件
 */
function loginAdminBtnClick() {
    var userName = $('#inputUsername').val();
    var userPassword = $("#inputPassword").val();
    if (IsValidValue(userName)||IsValidValue(userPassword)){
        $("#errorLabel").text("用户名和密码不能为空！");
        return;
    }
    $.ajax({
        url: "login",
        type:'POST',
        data:{
            userName:userName,userPassword:userPassword
        },
        dataType:'json',
        success: function(data){
            if(data){
                window.location=ctx +"/admin/manager";
            }else{
                $("#errorLabel").text("用户名或者密码错误！");
            }
       }
    });
}