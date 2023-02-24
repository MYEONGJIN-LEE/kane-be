CREATE TABLE IF NOT EXISTS `members` (
  `member_id` INT NOT NULL AUTO_INCREMENT COMMENT '회원아이디',
  `member_uuid` VARCHAR(36) NULL COMMENT '회원고유식별아이디(Cognito ID)',
  `member_name` VARCHAR(50) NOT NULL COMMENT '회원명',
  `email_address` VARCHAR(100) NOT NULL COMMENT 'Email 주소',
  `provider` VARCHAR(50) NULL COMMENT '소셜로그인제공자',
  `nickname` VARCHAR(20) NULL COMMENT '닉네임',
  `introduce` VARCHAR(300) NULL COMMENT '자기소개',
  `sns_url` VARCHAR(200) NULL COMMENT 'SNS URL',
  `phone_number` VARCHAR(50) NULL COMMENT '휴대전화번호',
  `profile_url` VARCHAR(200) NULL COMMENT '프로필사진URL' DEFAULT '/PROFILE/default_profile.png',
  `level_id` INT NOT NULL COMMENT '회원레벨아이디' DEFAULT 1,
  `member_state_code` VARCHAR(50) NOT NULL COMMENT '회원상태코드 NORMAL:정상, HALT:중지' DEFAULT 'NORMAL',
  `role_type_code` VARCHAR(50) NOT NULL COMMENT '역할코드 BASIC:일반회원, ADMIN:관리자 , MASTER_ADMIN:관리자' DEFAULT 'BASIC',
  `black_member_yn` VARCHAR(1) NOT NULL COMMENT '블랙회원여부' DEFAULT 'N',
  `black_member_updated_datetime` DATETIME NULL COMMENT '블랙회원여부수정시간',
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

-- ALTER TABLE `members` ADD UNIQUE index members_ix1(nickname);
-- ALTER TABLE `members` ADD UNIQUE index members_ix2(member_uuid);
-- ALTER TABLE `members` ADD UNIQUE index members_ix3(email_address);
ALTER TABLE `members` auto_increment=10000;