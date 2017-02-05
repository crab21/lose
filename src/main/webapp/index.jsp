<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello World!</h2>
<div>
    <div class='weui_panel weui_panel_access'>
        <!--<div class='weui_panel_hd'>图文组合列表</div>-->
        <div class='weui_panel_bd'>
            <a href='javascript:void(0);' class='weui_media_box weui_media_appmsg'>
                <div class='weui_media_hd'>
                    <img class='weui_media_appmsg_thumb' src='111.png' alt=''>
                </div>
                <div class='weui_media_bd'>
                    <h4 class='weui_media_title'>${list}</h4>
                    <p class='weui_media_desc'>失物上交</p>
                    <p class='weui_media_desc'>失物上交</p>
                </div>
            </a>
            <a href='javascript:void(0);' class='weui_media_box weui_media_appmsg'>
                <div class='weui_media_hd'>
                    <img class='weui_media_appmsg_thumb'
                         src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHgAAAB4CAMAAAAOusbgAAAAeFBMVEUAwAD///+U5ZTc9twOww7G8MYwzDCH4YcfyR9x23Hw+/DY9dhm2WZG0kbT9NP0/PTL8sux7LFe115T1VM+zz7i+OIXxhes6qxr2mvA8MCe6J6M4oz6/frr+us5zjn2/fa67rqB4IF13XWn6ad83nxa1loqyirn+eccHxx4AAAC/klEQVRo3u2W2ZKiQBBF8wpCNSCyLwri7v//4bRIFVXoTBBB+DAReV5sG6lTXDITiGEYhmEYhmEYhmEYhmEY5v9i5fsZGRx9PyGDne8f6K9cfd+mKXe1yNG/0CcqYE86AkBMBh66f20deBc7wA/1WFiTwvSEpBMA2JJOBsSLxe/4QEEaJRrASP8EVF8Q74GbmevKg0saa0B8QbwBdjRyADYxIhqxAZ++IKYtciPXLQVG+imw+oo4Bu56rjEJ4GYsvPmKOAB+xlz7L5aevqUXuePWVhvWJ4eWiwUQ67mK51qPj4dFDMlRLBZTqF3SDvmr4BwtkECu5gHWPkmDfQh02WLxXuvbvC8ku8F57GsI5e0CmUwLz1kq3kD17R1In5816rGvQ5VMk5FEtIiWislTffuDpl/k/PzscdQsv8r9qWq4LRWX6tQYtTxvI3XyrwdyQxChXioOngH3dLgOFjk0all56XRi/wDFQrGQU3Os5t0wJu1GNtNKHdPqYaGYQuRDfbfDf26AGLYSyGS3ZAK4S8XuoAlxGSdYMKwqZKM9XJMtyqXi7HX/CiAZS6d8bSVUz5J36mEMFDTlAFQzxOT1dzLRljjB6+++ejFqka+mXIe6F59mw22OuOw1F4T6lg/9VjL1rLDoI9Xzl1MSYDNHnPQnt3D1EE7PrXjye/3pVpr1Z45hMUdcACc5NVQI0bOdS1WA0wuz73e7/5TNqBPhQXPEFGJNV2zNqWI7QKBd2Gn6AiBko02zuAOXeWIXjV0jNqdKegaE/kJQ6Bfs4aju04lMLkA2T5wBSYPKDGF3RKhFYEa6A1L1LG2yacmsaZ6YPOSAMKNsO+N5dNTfkc5Aqe26uxHpx7ZirvgCwJpWq/lmX1hA7LyabQ34tt5RiJKXSwQ+0KU0V5xg+hZrd4Bn1n4EID+WkQdgLfRNtvil9SPfwy+WQ7PFBWQz6dGWZBLkeJFXZGCfLUjCgGgqXo5TuSu3cugdcTv/HjqnBTEMwzAMwzAMwzAMwzAMw/zf/AFbXiOA6frlMAAAAABJRU5ErkJggg=='
                         alt=''>
                </div>
                <div class='weui_media_bd'>
                    <h4 class='weui_media_title'>标题二</h4>
                    <p class='weui_media_desc'>失物申报</p>
                </div>
            </a>
        </div>
    </div>
</div>
<div class="page_bd">
    <div class="weui_cells_title">单选列表项</div>
    <div class="weui_cells weui_cells_radio">
        <label class="weui_cell weui_check_label" for="x11">
            <div class="weui_cell_bd">
                <p>cell standard</p>
            </div>
            <div class="weui_cell_ft">
                <input type="radio" class="weui_check" name="radio1" id="x11">
                <span class="weui_icon_checked"></span>
            </div>
        </label>
        <label class="weui_cell weui_check_label" for="x12">

            <div class="weui_cell_bd">
                <p>cell standard</p>
            </div>
            <div class="weui_cell_ft">
                <input type="radio" name="radio1" class="weui_check" id="x12" checked="checked">
                <span class="weui_icon_checked"></span>
            </div>
        </label>
    </div>
</div>


<div class="weui_cells_title">文本框</div>
<div class="weui_cells">
    <div class="weui_cell">
        <div class="weui_cell_bd">
            <input class="weui_input" type="text" placeholder="请输入文本"/>
        </div>
    </div>
</div>

<div class="weui_cells_title">文本域</div>
<div class="weui_cells weui_cells_form">
    <div class="weui_cell">
        <div class="weui_cell_bd">
            <textarea class="weui_textarea" placeholder="请输入文本" rows="3"></textarea>
            <div class="weui_textarea_counter"><span>0</span>/200</div>
        </div>
    </div>
</div>


<div class="weui_cell weui_cell_vcode">
    <div class="weui_cell_hd">
        <label class="weui_label">手机号</label>
    </div>
    <div class="weui_cell_bd">
        <input class="weui_input" type="tel" placeholder="请输入手机号">
    </div>
</div>
</body>
</html>
