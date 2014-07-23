<%@ taglib prefix="s" uri="/struts-tags" %>
<a href="add" class="btn btn-primary">Add user</a>
<h1>User list</h1>
<s:iterator value="users" status="userStatus">
    <s:property value="id" />
    <s:property value="login" />
</s:iterator>