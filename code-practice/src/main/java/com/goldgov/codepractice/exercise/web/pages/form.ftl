<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<#if (!role??) || (!exercise.roleID??) >
<form method="post" action="./add">
</#if>
<#if role?? && (exercise.roleID??)>
<form method="post" action="./update">
<input type="hidden" name="exerciseID" value="${(exercise.roleID)!}">
</#if>

<@i18n code="label.title" suffix="colon"/><input type="text" name="title" value="${(exercise.title)!}"><br>
<@i18n code="label.category" suffix="colon"/><input type="text" name="category" value="${(exercise.category)!}"><br>
<@i18n code="label.difficulty" suffix="colon"/><input type="text" name="difficulty" value="${(exercise.difficulty)!}"><br>
<@i18n code="label.timeLimit" suffix="colon"/><input type="text" name="timeLimit" value="${(exercise.timeLimit)!}"><br>
<@i18n code="label.scorePoint" suffix="colon"/><input type="text" name="scorePoint" value="${(exercise.scorePoint)!}"><br>
<@i18n code="label.statement" suffix="colon"/><input type="text" name="statement" value="${(exercise.statement)!}"><br>
<@i18n code="label.className" suffix="colon"/><input type="text" name="definitionClass" value="${(exercise.definitionClass)!}"><br>
<@i18n code="label.methodName" suffix="colon"/><input type="text" name="definitionMethod" value="${(exercise.definitionMethod)!}"><br>
<@i18n code="label.parameter" suffix="colon"/><input type="text" name="definitionParams" value="${(exercise.definitionParams)!}"><br>
<@i18n code="label.return" suffix="colon"/><input type="text" name="definitionReturn" value="${(exercise.definitionReturn)!}"><br>
<@i18n code="label.constraint" suffix="colon"/><input type="text" name="constraints" value="${(exercise.constraints)!}"><br>
<@i18n code="label.note" suffix="colon"/><input type="text" name="note" value="${(exercise.note)!}"><br>
<@i18n code="label.example" suffix="colon"/><input type="text" name="example" value="${(exercise.example)!}"><br>
<input type="hidden" name="${Request['_csrf'].parameterName}" value="${Request['_csrf'].token}"/>
${webToken(true)}
<br>
<input type="submit" value="<@i18n code="submit"/>"/> <input type="button" value="<@i18n code="back"/>" onclick="window.open('./findList')"/>

</form>

</body>
</html>