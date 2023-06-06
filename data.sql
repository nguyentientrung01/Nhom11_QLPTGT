create database QLPTGT_3
go
use QLPTGT_3
go 

create table oto (
	idxe nvarchar(100) primary key,
	ten nvarchar(100),
	hangxe nvarchar(100),
	mausac nvarchar(100),
	giaban int,
	namsx int,
	soluong int,
	socho int,
	nhienlieu nvarchar(100)
);

create table xetai (
	idxe nvarchar(100) primary key,
	ten nvarchar(100),
	hangxe nvarchar(100),
	mausac nvarchar(100),
	giaban int,
	namsx int,
	soluong int,
	trongtai int,
	nhienlieu nvarchar(100)
);

create table xemay (
	idxe nvarchar(100) primary key,
	ten nvarchar(100),
	hangxe nvarchar(100),
	mausac nvarchar(100),
	giaban int,
	namsx int,
	soluong int,
	dongco nvarchar(100),
	dungtichxl nvarchar(100)
);


create table Account(
	username nvarchar(100),
	password nvarchar(100),
	displayname nvarchar(100),
	role nvarchar(100),
	status nvarchar(100)
);


create table hoadon (
	mahoadon nvarchar(100),
	ngaytao nvarchar(100),
	tenxe nvarchar(100),
	hangxe nvarchar(100),
	soluong int,
	nguoimua nvarchar(100),
	diachi nvarchar(100),
	sdt nvarchar(100),
	taikhoan nvarchar(100),
	trangthai nvarchar(100)
)


insert into oto values 
('oto1','Camry','Toyota','red',24000000,2010,23,16,N'Dầu'),
('oto2','Accord','honda','green',13500000,2013,42,4,N'Dầu'),
('oto3','Camoro','Chevrolet','blue',17300000,2015,54,8,N'Dầu');


insert into xetai values 
('xetai1','Ford F-150','Ford','red',24000000,2010,23,500,N'Dầu'),
('xetai2','Toyota Tundra','Toyota','green',13500000,2013,500,4,N'Dầu'),
('xetai3','Ram 1500','Ram','blue',17300000,2015,400,8,'Dầu');

insert into xemay values 
('xemay1','Ford F-150','Ford','red',24000000,2010,23,'500cc',N'Dầu'),
('xemay2','Toyota Tundra','Toyota','green',13500000,2013,'300cc',4,N'Dầu'),
('xemay3','Ram 1500','Ram','blue',17300000,2015,400,'400cc',N'Dầu');

