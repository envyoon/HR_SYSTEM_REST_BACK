package com.precursor.hrsystem.mvc.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrListVO{
	private int imKey;
	private String imUserId;
	private String imUserNameKr;
	private String imUserNameEn;
	private String imUserRank;
	private String imDept;
	private String imUserMail;
	private String imPhoneNum;
	private Date imHireDate;
	private Date imUpdate;
	private String imUserPw;
	private String imFlag;
	private String imStatus;
	private Date ercoYmd;
	private Date rtrmYmd;
	private Date birymd;
}
