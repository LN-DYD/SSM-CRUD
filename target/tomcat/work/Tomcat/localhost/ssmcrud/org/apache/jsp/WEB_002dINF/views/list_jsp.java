/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-05 03:53:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <title>员工列表</title>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/css/bootstrap.min.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 添加用户模态框 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"add_empl_Modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">添加员工</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <!-- 表单 -->\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">员工姓名</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"empName_add\" placeholder=\"empName\"\r\n");
      out.write("                                   name=\"empName\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">邮箱</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"email_add\" placeholder=\"mail\" name=\"mail\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">性别</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"radio1\" value=\"男\" checked=\"true\"> 男\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"radio2\" value=\"女\"> 女\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">部门</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <select class=\"form-control\" name=\"dId\" id=\"dept_select_data\">\r\n");
      out.write("                                <!-- 显示部门 -->\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"save_empl\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 修改用户模态框 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"update_empl_Modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"update_empl_label\">修改员工</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <!-- 表单 -->\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <input type=\"hidden\" id=\"empId_update\" name=\"empId\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">员工姓名</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"empName_update\" placeholder=\"empName\"\r\n");
      out.write("                                   name=\"empName\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">邮箱</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"email_update\" placeholder=\"mail\" name=\"mail\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">性别</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"男\" checked=\"true\"> 男\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"女\"> 女\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">部门</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <select class=\"form-control\" name=\"dId\" id=\"dept_update_data\">\r\n");
      out.write("                                <!-- 显示部门 -->\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"update_empl\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <!-- 第一行：显示标题 -->\r\n");
      out.write("    <div class=\"row\" style=\"padding-bottom: 50px ;\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <h1>SSM-CRUD</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 第二行：添加删除按钮 -->\r\n");
      out.write("    <div class=\"row\" style=\"padding-bottom: 10px ;\">\r\n");
      out.write("        <div class=\"col-md-4  col-md-offset-8\">\r\n");
      out.write("            <button class=\"btn btn-primary\" id=\"add_empl_btn\">新增</button>\r\n");
      out.write("            <button class=\"btn btn-danger\" id=\"del_empl_btn\">删除</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 第三行：显示数据表格 -->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <table class=\"table table-hover\" id=\"empl_table\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><input type=\"checkbox\" id=\"check_all\"></th>\r\n");
      out.write("                    <th>#</th>\r\n");
      out.write("                    <th>姓名</th>\r\n");
      out.write("                    <th>性別</th>\r\n");
      out.write("                    <th>邮箱</th>\r\n");
      out.write("                    <th>部门</th>\r\n");
      out.write("                    <th>操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 第四行：分页 -->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!-- 显示分页数据 -->\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <span class=\"label label-primary\" id=\"page_data\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 显示分页页码 -->\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("\r\n");
      out.write("            <nav aria-label=\"Page navigation\">\r\n");
      out.write("                <ul class=\"pagination\" id=\"page_nav_ul\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //  刷新页面立即调用此方法\r\n");
      out.write("    $(function () {\r\n");
      out.write("        toPage(1);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //转到页面\r\n");
      out.write("    function toPage(pn) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/empl\",\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            data: \"pn=\" + pn,\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                build_empl(data);\r\n");
      out.write("                build_page_data(data);\r\n");
      out.write("                build_page_nav(data);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    //解析并显示员工信息\r\n");
      out.write("    function build_empl(msg) {\r\n");
      out.write("        //清除之前的员工信息\r\n");
      out.write("        $(\"#empl_table tbody\").empty();\r\n");
      out.write("\r\n");
      out.write("        var emps = msg.map.pageInfo.list;\r\n");
      out.write("        $.each(emps, function (index, item) {\r\n");
      out.write("            var td_checkbox = $(\"<td></td>\").append($(\"<input type='checkbox' class='check_items'/>\"));\r\n");
      out.write("            var td_empId = $(\"<td></td>\").append(item.empId);\r\n");
      out.write("            var td_empName = $(\"<td></td>\").append(item.empName);\r\n");
      out.write("            var td_gender = $(\"<td></td>\").append(item.gender);\r\n");
      out.write("            var td_mail = $(\"<td></td>\").append(item.mail);\r\n");
      out.write("            var td_department = $(\"<td></td>\").append(item.department.depName);\r\n");
      out.write("            var btn_1 = $(\"<button></button>\").addClass(\"btn btn-primary btn-sm edit_btn\").css(\"margin-right\", \"3px\")\r\n");
      out.write("                .append(\"<span></span>\").addClass(\"glyphicon glyphicon-pencil\").append(\"编辑\");\r\n");
      out.write("            btn_1.attr(\"edit_id\", item.empId);\r\n");
      out.write("            var btn_2 = $(\"<button></button>\").addClass(\"btn btn-danger btn-sm del_btn\")\r\n");
      out.write("                .append(\"<span></span>\").addClass(\"glyphicon glyphicon-trash\").append(\"删除\");\r\n");
      out.write("            btn_2.attr(\"del_id\", item.empId);\r\n");
      out.write("            var td_btn = $(\"<td></td>\").append(btn_1).append(btn_2);\r\n");
      out.write("\r\n");
      out.write("            var tr = $(\"<tr></tr>\").append(td_checkbox).append(td_empId).append(td_empName).append(td_gender)\r\n");
      out.write("                .append(td_mail).append(td_department).append(td_btn);//\r\n");
      out.write("            $(\"#empl_table tbody\").append(tr);\r\n");
      out.write("        })\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    //解析并显示分页信息\r\n");
      out.write("    function build_page_data(msg) {\r\n");
      out.write("        //清除之前的分页信息\r\n");
      out.write("        $(\"#page_data\").empty();\r\n");
      out.write("\r\n");
      out.write("        $(\"#page_data\").append(\"第\" + msg.map.pageInfo.pageNum + \"页  共\" + msg.map.pageInfo.pages\r\n");
      out.write("            + \"页 总计\" + msg.map.pageInfo.total + \"条记录\");\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    //解析并显示分页导航\r\n");
      out.write("    function build_page_nav(msg) {\r\n");
      out.write("        //清除之前的分页导航\r\n");
      out.write("        $(\"#page_nav_ul\").empty();\r\n");
      out.write("\r\n");
      out.write("        var ul = $(\"#page_nav_ul\");\r\n");
      out.write("        var firstPage = $(\"<li></li>\").append($(\"<a></a>\").append(\"首页\").attr(\"href\", \"#\"));\r\n");
      out.write("        var prePage = $(\"<li></li>\").append($(\"<a></a>\").attr(\"href\", \"#\").attr(\"aria-label\", \"Previous\").append(\"&laquo;\"));\r\n");
      out.write("        // 判断是否有前一页\r\n");
      out.write("        if (msg.map.pageInfo.hasPreviousPage == false) {\r\n");
      out.write("            firstPage.addClass(\"disabled\");\r\n");
      out.write("            prePage.addClass(\"disabled\");\r\n");
      out.write("        } else {\r\n");
      out.write("            //绑定点击事件\r\n");
      out.write("            firstPage.click(function () {\r\n");
      out.write("                toPage(1);\r\n");
      out.write("            });\r\n");
      out.write("            //绑定点击事件\r\n");
      out.write("            prePage.click(function () {\r\n");
      out.write("                toPage(msg.map.pageInfo.pageNum - 1);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var nextPage = $(\"<li></li>\").append($(\"<a></a>\").attr(\"href\", \"#\").attr(\"aria-label\", \"Previous\").append(\"&raquo;\"));\r\n");
      out.write("        var lastPage = $(\"<li></li>\").append($(\"<a></a>\").append(\"末页\").attr(\"href\", \"#\"));\r\n");
      out.write("        // 判断是否有后一页\r\n");
      out.write("        if (msg.map.pageInfo.hasNextPage == false) {\r\n");
      out.write("            nextPage.addClass(\"disabled\");\r\n");
      out.write("            lastPage.addClass(\"disabled\");\r\n");
      out.write("        } else {\r\n");
      out.write("            //绑定点击事件\r\n");
      out.write("            nextPage.click(function () {\r\n");
      out.write("                toPage(msg.map.pageInfo.pageNum + 1);\r\n");
      out.write("            });\r\n");
      out.write("            //绑定点击事件\r\n");
      out.write("            lastPage.click(function () {\r\n");
      out.write("                toPage(msg.map.pageInfo.pages);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        // 将元素插入到页面\r\n");
      out.write("        ul.append(firstPage).append(prePage);\r\n");
      out.write("        $.each(msg.map.pageInfo.navigatepageNums, function (index, item) {\r\n");
      out.write("            var i = $(\"<li></li>\").append($(\"<a></a>\").append(item).attr(\"href\", \"#\"));\r\n");
      out.write("            ul.append(i);\r\n");
      out.write("            if (item == msg.map.pageInfo.pageNum) {\r\n");
      out.write("                i.addClass(\"active\");\r\n");
      out.write("            }\r\n");
      out.write("            //绑定点击事件\r\n");
      out.write("            i.click(function () {\r\n");
      out.write("                toPage(item);\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        ul.append(nextPage).append(lastPage);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //解析表单下拉列表的部门信息\r\n");
      out.write("    function build_dept_option(msg, ele) {\r\n");
      out.write("        var dept_select = ele;\r\n");
      out.write("        //清空之前部门\r\n");
      out.write("        dept_select.empty();\r\n");
      out.write("        //构建部门数据\r\n");
      out.write("        $.each(msg.map.dept, function (index, item) {\r\n");
      out.write("            dept_select.append($(\"<option></option>\").append(item.depName).val(item.depId));\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //新增按钮\r\n");
      out.write("    $(\"#add_empl_btn\").click(function () {\r\n");
      out.write("        //请求部门\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dept\",\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                build_dept_option(data, $(\"#dept_select_data\"));\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        //清除表单内容\r\n");
      out.write("        $(\"#add_empl_Modal form\")[0].reset();\r\n");
      out.write("        //清空表单样式\r\n");
      out.write("        $(\"#add_empl_Modal div\").removeClass(\"has-error has-success\");\r\n");
      out.write("        $(\"#add_empl_Modal form\").find(\".help-block\").text(\"\");\r\n");
      out.write("        //打开模态框\r\n");
      out.write("        $(\"#add_empl_Modal\").modal({\r\n");
      out.write("            backdrop: \"static\"\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //编辑按钮\r\n");
      out.write("    $(document).on(\"click\", \".edit_btn\", function () {\r\n");
      out.write("        //请求部门\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dept\",\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                build_dept_option(data, $(\"#dept_update_data\"));\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        //得到当前选中的id\r\n");
      out.write("        var edit_id = $(this).attr(\"edit_id\");\r\n");
      out.write("        getEmpl(edit_id);\r\n");
      out.write("\r\n");
      out.write("        //打开模态框\r\n");
      out.write("        $(\"#update_empl_Modal\").modal({\r\n");
      out.write("            backdrop: \"static\"\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //删除按钮\r\n");
      out.write("    $(document).on(\"click\", \".del_btn\", function () {\r\n");
      out.write("        //得到点击的id\r\n");
      out.write("        var del_id = $(this).attr(\"del_id\");\r\n");
      out.write("        //弹出确认框\r\n");
      out.write("        if (confirm(\"是否确认删除！\")) {\r\n");
      out.write("            //给服务器发送请求\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deleteEmpl/\" + del_id,\r\n");
      out.write("                type: \"delete\",\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    toPage(1);\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //修改保存按钮\r\n");
      out.write("    $(\"#update_empl\").click(function () {\r\n");
      out.write("        //校验用户名\r\n");
      out.write("        var empName = $(\"#empName_update\").val();\r\n");
      out.write("        var reg = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)/;\r\n");
      out.write("        if (!reg.test(empName)) {\r\n");
      out.write("            show_validata_msg($(\"#empName_update\"), \"error\", \"用户名为4-16英文数字组合或者2-5位中文\");\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            show_validata_msg($(\"#empName_update\"), \"success\", \"\");\r\n");
      out.write("        }\r\n");
      out.write("        //校验邮箱\r\n");
      out.write("        var email = $(\"#email_update\").val();\r\n");
      out.write("        var reg2 = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("        if (!reg2.test(email)) {\r\n");
      out.write("            show_validata_msg($(\"#email_update\"), \"error\", \"请输入正确邮箱！\");\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            show_validata_msg($(\"#email_update\"), \"success\", \"\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var data = formToJson($(\"#update_empl_Modal form\"));\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/updateEmpl\",\r\n");
      out.write("            type: \"put\",\r\n");
      out.write("            data: JSON.stringify(data),\r\n");
      out.write("            contentType: \"application/json;charset=UTF/8\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                //转到第一页\r\n");
      out.write("                toPage(1);\r\n");
      out.write("                //关闭修改框\r\n");
      out.write("                $(\"#update_empl_Modal\").modal(\"hide\");\r\n");
      out.write("                alert(data.msg);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //保存用户按钮\r\n");
      out.write("    $(\"#save_empl\").click(function () {\r\n");
      out.write("        //校验\r\n");
      out.write("        if (!validata_add_form()) return;\r\n");
      out.write("\r\n");
      out.write("        var data = formToJson($(\"#add_empl_Modal form\"));\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/save\",\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            data: JSON.stringify(data),\r\n");
      out.write("            contentType: \"application/json;charset=UTF/8\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                if (data.code == 100) {\r\n");
      out.write("                    //员工保存成功\r\n");
      out.write("                    //页面跳转到新增的一页\r\n");
      out.write("                    toPage(9999);\r\n");
      out.write("                    toPage(9999);\r\n");
      out.write("                    //关闭新增对话框\r\n");
      out.write("                    $(\"#add_empl_Modal\").modal(\"hide\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    //失败信息\r\n");
      out.write("                    if (!undefined == data.map.errorField.mail) {\r\n");
      out.write("                        show_validata_msg($(\"#email_add\"), \"error\", data.map.errorField.mail);\r\n");
      out.write("                    }\r\n");
      out.write("                    if (!undefined == data.map.errorField.empName) {\r\n");
      out.write("                        show_validata_msg($(\"#empName_add\"), \"error\", data.map.errorField.empName);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //按id得到empl\r\n");
      out.write("    function getEmpl(id) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/getEmpl/\" + id,\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                $(\"#empId_update\").val(data.map.empl.empId);\r\n");
      out.write("                $(\"#empName_update\").val(data.map.empl.empName);\r\n");
      out.write("                $(\"#email_update\").val(data.map.empl.mail);\r\n");
      out.write("                $(\"#update_empl_Modal input[name=gender]\").val([data.map.empl.gender]);\r\n");
      out.write("\r\n");
      out.write("                $(\"#update_empl_Modal select\").val(data.map.empl.dId);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //服务器校验表单\r\n");
      out.write("    $(\"#empName_add\").change(function () {\r\n");
      out.write("        var empName = $(this).val();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkName\",\r\n");
      out.write("            type: \"post\",\r\n");
      out.write("            data: \"empName=\" + empName,\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                if (data.code == 100) {\r\n");
      out.write("                    show_validata_msg($(\"#empName_add\"), \"success\", \"\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    show_validata_msg($(\"#empName_add\"), \"error\", data.map.msg);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //校验增加员工表单\r\n");
      out.write("    function validata_add_form() {\r\n");
      out.write("        //校验用户名\r\n");
      out.write("        var empName = $(\"#empName_add\").val();\r\n");
      out.write("        var reg = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)/;\r\n");
      out.write("        if (!reg.test(empName)) {\r\n");
      out.write("            show_validata_msg($(\"#empName_add\"), \"error\", \"用户名为4-16英文数字组合或者2-5位中文\");\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            show_validata_msg($(\"#empName_add\"), \"success\", \"\");\r\n");
      out.write("        }\r\n");
      out.write("        //校验邮箱\r\n");
      out.write("        var email = $(\"#email_add\").val();\r\n");
      out.write("        var reg2 = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("        if (!reg2.test(email)) {\r\n");
      out.write("            show_validata_msg($(\"#email_add\"), \"error\", \"请输入正确邮箱！\");\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            show_validata_msg($(\"#email_add\"), \"success\", \"\");\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //全选复选框事件\r\n");
      out.write("    $(\"#check_all\").click(function () {\r\n");
      out.write("        var flag = $(this).prop(\"checked\");\r\n");
      out.write("        $(\".check_items\").prop(\"checked\", flag);\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //单选复选框事件\r\n");
      out.write("    $(document).on(\"click\", \".check_items\", function () {\r\n");
      out.write("        var flag = $(\".check_items:checked\").length == $(\".check_items\").length;\r\n");
      out.write("        $(\"#check_all\").prop(\"checked\", flag);\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //多选删除按钮\r\n");
      out.write("    $(\"#del_empl_btn\").click(function () {\r\n");
      out.write("        var data = \"\";\r\n");
      out.write("        $.each($(\".check_items:checked\"), function () {\r\n");
      out.write("            data += $(this).parents(\"tr\").find(\"td\").eq(1).text() + \"-\";\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("        var ids = data.substring(0, data.length - 1);\r\n");
      out.write("        if(ids != \"\"){\r\n");
      out.write("            if (confirm(\"是否确认删除多项！\")) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deleteEmpl/\" + ids,\r\n");
      out.write("                    type: \"delete\",\r\n");
      out.write("                    success: function () {\r\n");
      out.write("                        toPage(1);\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    //校验数据提示\r\n");
      out.write("    function show_validata_msg(ele, status, msg) {\r\n");
      out.write("        //清除当前元素的校验状态\r\n");
      out.write("        ele.parent().removeClass(\"has-error has-success\");\r\n");
      out.write("        ele.next(\"span\").text(\"\");\r\n");
      out.write("        if (status == \"success\") {\r\n");
      out.write("            ele.parent().addClass(\"has-success\");\r\n");
      out.write("            ele.next(\"span\").text(msg);\r\n");
      out.write("        } else {\r\n");
      out.write("            ele.parent().addClass(\"has-error\");\r\n");
      out.write("            ele.next(\"span\").text(msg);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //表单转json\r\n");
      out.write("    function formToJson(ele) {\r\n");
      out.write("        var data = ele.serialize();\r\n");
      out.write("        data = decodeURIComponent(data, true);//防止中文乱码\r\n");
      out.write("        data = data.replace(/&/g, \"','\");\r\n");
      out.write("        data = data.replace(/=/g, \"':'\");\r\n");
      out.write("        data = \"({'\" + data + \"'})\";\r\n");
      out.write("        obj = eval(data);\r\n");
      out.write("        return obj;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
