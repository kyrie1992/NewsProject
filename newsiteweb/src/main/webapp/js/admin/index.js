/**
 * 后台登录事件
 */
function loginAdminBtnClick() {
    $.ajax({
        url: "login?",
        type:'POST',
        data:{
            name:'yang',age:25
        },
        dataType:'json',
        success: function(data){
            if(data){
                window.location=ctx +"/admin/manager";
            }
       }
    });
}