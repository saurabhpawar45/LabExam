﻿CREATE PROCEDURE [dbo].InsertEmployee
	@EmpNo int,
	@Name varchar(50),
	@Basic decimal(18,2),
	@DeptNo int
AS
	insert into Table values (@EmpNo,@Name,@Basic,@DeptNo)

