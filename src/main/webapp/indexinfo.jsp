<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 17-1-31
  Time: 下午7:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div>
    <div class='weui_panel weui_panel_access'>
        <!--<div class='weui_panel_hd'>图文组合列表</div>-->
        <div class='weui_panel_bd'>
            <s:iterator value="listIndexInfo">
                <a href='javascript:void(0);' class='weui_media_box weui_media_appmsg'>
                    <%--<div class='weui_media_hd'>--%>
                        <%--<img class='weui_media_appmsg_thumb' src='111.png' alt=''>--%>
                    <%--</div>--%>
                    <div class='weui_media_bd'>
                        <h4 class='weui_media_title'><s:property value="loseName"/></h4>
                        <p class='weui_media_desc'>
                            类型:<s:property value="lid"/>
                            <s:if test="%{loseType==0}">
                                失物申报
                            </s:if>
                            <s:else>
                                失物上交
                            </s:else>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            地点:<s:property value="loseLocation"/>
                        </p>
                        <p class='weui_media_desc'>时间:<s:property value="loseTime"/></p>
                    </div>
                </a>
            </s:iterator>
            <s:if test="%{p.total==p.page}">
                暂无更多信息.
            </s:if>
            <%--总页数和页数传到主页中去     后续需要优化--%>
            <span style="display:none" , id="span1">${p.page}</span>
            <span style="display:none" , id="span2">${p.total}</span>
        </div>
    </div>
</div>
<%--el ongl jsp --%>
<%--% # $--%>


