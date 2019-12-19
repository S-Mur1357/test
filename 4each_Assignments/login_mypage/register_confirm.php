<?php
mb_internal_encoding("utf8");

$temp_pic_name = $_FILES['picture']['tmp_name'];

$original_pic_name = $_FILES['picture']['name'];
$path_filename = './image/'.$original_pic_name;

move_uploaded_file($temp_pic_name,'./image/'.$original_pic_name);

?>



<!DOCTYPE html>
<html lang="ja">

    <head>
        <title>マイページ登録</title>
        <link rel="stylesheet" type="text/css" href="register_confirm.css">
    </head>    
    <body>
    
     <header>
        <img src="4eachblog_logo.jpg"> 
        <div class="login"><a href ="login.php">ログイン</a></div>
    </header>
    
    <main>
           <div class="member_confirm">
                <h2>会員登録 確認</h2><br>
                <h4>こちらの内容で登録しても宜しいでしょうか？</h4><br>
                <p>氏名 : 
                    <?php echo $_POST['name']; ?><br>
                </p>
                <br>
                <p>メール : 
                    <?php echo $_POST['mail']; ?><br>
                </p>
                <br>
                <p>パスワード : 
                    <?php echo $_POST['password']; ?><br>
                </p>
                <br>
                <p>プロフィール写真 : 
                <?php echo $path_filename; ?><br>
                </p>
                <br>
                <p>コメント : 
                    <?php echo $_POST['comments']; ?><br>
                </p>  
                <br>
                
                <form action="register.php">
                    <input type="submit" class="submit_button_return" size="35" value="戻って修正する">
                </form>
                
                <form action="register_insert.php" method="post" enctype="multipart/form-data">
                    <input type="submit" class="submit_button_register" size="35" value="登録する">
                    <input type="hidden" value="<?php echo $_POST['name']; ?>" name="name">
                    <input type="hidden" value="<?php echo $_POST['mail']; ?>" name="mail">
                    <input type="hidden" value="<?php echo $_POST['password']; ?>" name="password">
                    <input type="hidden" value="<?php echo $path_filename; ?>" name="path_filename">
                    <input type="hidden" value="<?php echo $_POST['comments']; ?>" name="comments">
                </form>
            </div>   
    </main>
    
    <footer>
        © 2018 InterNous.inc. All rights reserved
    </footer>
    
    </body>
</html>