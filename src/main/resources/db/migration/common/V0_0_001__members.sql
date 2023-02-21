CREATE TABLE IF NOT EXISTS `members` (
  `member_id` INT NOT NULL AUTO_INCREMENT COMMENT '회원아이디',
  `member_uuid` VARCHAR(36) NOT NULL COMMENT '회원고유식별아이디(Cognito ID)',
  `member_name` VARCHAR(50) NULL COMMENT '회원명',
  `email_address` VARCHAR(100) NOT NULL COMMENT 'Email 주소',
  `nickname` VARCHAR(20) NULL COMMENT '닉네임',
  `introduce` VARCHAR(300) NULL COMMENT '자기소개',
  `sns_url` VARCHAR(200) NULL COMMENT 'SNS URL',
  `pass_ci` VARCHAR(300) NULL COMMENT 'PASS CI',
  `gender_code` VARCHAR(50) NULL COMMENT '성별코드',
  `age_group_code` VARCHAR(50) NULL COMMENT '연령대',
  `birth_year` VARCHAR(50) NULL COMMENT '출생년도',
  `phone_number` VARCHAR(50) NULL COMMENT '휴대전화번호',
  `profile_url` VARCHAR(200) NOT NULL COMMENT '프로필사진URL' DEFAULT '/PROFILE/default_profile.png',
  `profile_background_color` VARCHAR(20) NOT NULL COMMENT '프로필백그라운드컬러' DEFAULT '#68276E',
  `level_id` INT NOT NULL COMMENT '회원레벨아이디' DEFAULT 1,
  `push_allow_yn` VARCHAR(1) NOT NULL COMMENT '푸쉬설정여부' DEFAULT 'N',
  `push_updated_datetime` DATETIME NULL COMMENT '푸쉬설정수정시간',
  `sms_allow_yn` VARCHAR(1) NOT NULL COMMENT '문자설정여부' DEFAULT 'N',
  `sms_updated_datetime` DATETIME NULL COMMENT '문자설정수정시간',
  `email_allow_yn` VARCHAR(1) NOT NULL COMMENT '이메일설정여부' DEFAULT 'N',
  `email_updated_datetime` DATETIME NULL COMMENT '이메일설정수정시간',
  `funnels` VARCHAR(300) NULL COMMENT '깔때기',
  `member_state_code` VARCHAR(50) NOT NULL COMMENT '회원상태코드 NORMAL:정상, HALT:중지' DEFAULT 'NORMAL',
  `role_type_code` VARCHAR(50) NOT NULL COMMENT '역할코드 BASIC:일반회원, CORPORATE:법인, ADMIN:관리자 , MASTER_ADMIN:관리자' DEFAULT 'BASIC',
  `black_member_yn` VARCHAR(1) NOT NULL COMMENT '블랙회원여부' DEFAULT 'N',
  `black_member_updated_datetime` DATETIME NULL COMMENT '블랙회원여부수정시간',
  `department_name` VARCHAR(50) NULL COMMENT '부서명',
  `position_name` VARCHAR(50) NULL COMMENT '직급명',
  `note` VARCHAR(50) NULL COMMENT '노트',
  `password` VARCHAR(100) NULL COMMENT 'password',
  `password_history` VARCHAR(100) NULL COMMENT 'password history',
  `password_wrong_count` INT NOT NULL COMMENT '패스워드 틀린 횟수' DEFAULT 0,
  `password_last_modified_datetime` DATETIME NULL COMMENT '패스워드 최종수정일시',
  `session_id` VARCHAR(100) NULL COMMENT '세션ID',
  `last_login_datetime` DATETIME NULL COMMENT '최종 로그인 일시',
  `created_datetime` DATETIME NOT NULL COMMENT '최초생성일시',
  `create_member_id` INT NOT NULL COMMENT '최초생성자회원ID',
  `updated_datetime` DATETIME NOT NULL COMMENT '최종수정일시',
  `update_member_id` INT NOT NULL COMMENT '최종수정자회원ID',
  PRIMARY KEY (`member_id`))
ENGINE = InnoDB
COMMENT = '회원'
;

ALTER TABLE `members` ADD UNIQUE index members_ix1(nickname);
ALTER TABLE `members` ADD UNIQUE index members_ix2(member_uuid);
ALTER TABLE `members` ADD UNIQUE index members_ix3(email_address);

ALTER TABLE `members` auto_increment=10000;