<?php
mb_internal_encoding("utf8");

session_start();

//DB接続　try-catch文
try{
$pdo = new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
}catch(PDOException $e){
die("<p>申し訳ございません。現在サーバーが混み合っており一時的にアクセスができません。<br>しばらくしてから再度ログインしてください。</p><a href='http://localhost/login_mypage/login.php'>ログイン画面へ</a>");
}
//preparedステートメント(update)でsqlをセット
$stmt=$pdo->prepare("update login_mypage set name = '".$_POST['nameChanged']."',mail = '".$_POST['mailChanged']."', password = '".$_POST['passwordChanged']."',comments = '".$_POST['commentsChanged']."' where id = '".$_SESSION['id']."';");
//ececute
$stmt->execute();
//prearedステートメント
$stmt = $pdo->prepare("select * from login_mypage where mail=? && password=?");
$stmt->bindValue(1,$_POST['mailChanged']);
$stmt->bindValue(2,$_POST['passwordChanged']);

//execute
$stmt->execute();
$pdo = NULL;
//fetch -while文でテータ取得し　セッションに代入
while($row=$stmt->fetch()){
    $_SESSION['id']=$row['id'];
    $_SESSION['name']=$row['name'];
    $_SESSION['mail']=$row['mail'];
    $_SESSION['password']=$row['password'];
    $_SESSION['picture']=$row['picture'];
    $_SESSION['comments']=$row['comments'];
}
//mypage.phpへリダイレクト
header("Location:http://localhost/login_mypage/mypage.php");
?>