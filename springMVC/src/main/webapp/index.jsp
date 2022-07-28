<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- 新 Bootstrap4 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>

    <!-- bootstrap.bundle.min.js 用于弹窗、提示、下拉菜单，包含了 popper.min.js -->
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>

    <!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title></title>

</head>
<body>
<div  class="container">
    <h2>Hello World!</h2>
    <form action="user/login" method="post" id="login" >
        <label>
            <input type="text" name="name">
        </label>
    </form>
    <button  class="btn btn-outline-success"  id="a" >登录&nbsp;<span id="span"></span></button>
    <button  class="btn btn-outline-info"  id="b" >注册&nbsp;<span id="span01"></span></button>

    <button  class="btn btn-outline-danger"  id="num" >点我</button>

    <a href="${pageContext.request.contextPath}/user/findById01?uid=1002" class="btn btn-outline-dark" role="button">findById01</a>
    <a href="${pageContext.request.contextPath}/user/findById02/1002" class="btn btn-outline-dark" role="button">findById02</a>
    <a href="${pageContext.request.contextPath}/user/findById03/1003" class="btn btn-outline-dark" role="button">findAdminById03</a>
    <a href="${pageContext.request.contextPath}/user/findById04" class="btn btn-outline-dark" role="button">findAdminAll</a>


</div>

</body>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

<script type="text/javascript">

    $('#num').click(function () {
        var number01 =Math.ceil(Math.random()*700+100);
        console.log(number01);
    })

    let elementById = document.getElementById('a');
    $("#a").mouseup(function () {
        let number01 =Math.ceil(Math.random()*700+100);
        console.log(number01);
        let id = $("#a");
        id.attr("disabled","true");
        $("#b").attr("disabled","true");
        $("#span").addClass("spinner-border spinner-grow-sm");

        function yes() {
            $("#login").submit();
            // window.location.href='http://localhost:8080/springMVC/user/login'
            document.getElementById('a').click();
        }
        setTimeout(yes,number01);
    });

    $("#b").mouseup(function () {
        let number01 =Math.ceil(Math.random()*700+100);
        console.log(number01);
        let id = $("#b");
        id.attr("disabled","true");

        $("#a").attr("disabled","true");

        $("#span01").addClass("spinner-border spinner-grow-sm");
        function yes() {
            window.location.href='http://localhost:8080/springMVC/register.jsp'
        }
        setTimeout(yes,number01);
    });
</script>

<script type="text/javascript">
    let isPageHide = false;
    window.addEventListener('pageshow', function () {
        if (isPageHide) {
            window.location.reload();
        }
    });
    window.addEventListener('pagehide', function () {
        isPageHide = true;
    });

</script>
</html>
