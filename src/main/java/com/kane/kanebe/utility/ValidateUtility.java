package com.kane.kanebe.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class ValidateUtility {
    private ValidateUtility() {
        // 유틸클래스 선언 방지
    }

    public static boolean isValidDateFormat(String dateStr, String dateFormat) {
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static Boolean invalidDateFormat(final String uploadFileName) {
        return !Pattern.compile("^[^_]+_{1}[0-9]{12}[^_]+$").matcher(uploadFileName).find();
    }

    public static Boolean checkYyyymm(final String yyyymm) {
        String regExp = "(19|20)\\d{2}(0[1-9]|1[012])";
        return yyyymm.matches(regExp);
    }

    public static boolean checkNicknameFormat(final String nickname) {
        String regExp = "^[a-z0-9._]{4,15}$"; // eng, num, ._
        return nickname.matches(regExp);
    }

    public static boolean checkEmail(final String email) {
        String regExp =
                "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z]?)*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*[.][a-zA-Z]{2,3}$";
        return email.matches(regExp);
    }

    public static boolean checkPhoneNumber(final String phoneNumber) {
        String regExp = "^[0-9]+$";
        return phoneNumber.matches(regExp);
    }

    public static boolean checkPassword(final String password) {
        String regExp =
                "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~])[A-Za-z\\d!\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]{8,20}$";

        return password.matches(regExp);
    }

    public static boolean isEmpty(final Object str) {
        if (str == null) {
            return true;
        }
        if ((str instanceof String) && (((String) str).trim().length() == 0)) {
            return true;
        }
        if (str instanceof Map) {
            return ((Map<?, ?>) str).isEmpty();
        }
        if (str instanceof List) {
            return ((List<?>) str).isEmpty();
        }
        if (str instanceof Object[]) {
            return (((Object[]) str).length == 0);
        }
        return false;
    }

    public static boolean checkDateDuration(String startDate, String endDate)
            throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date start = new Date(dateFormat.parse(startDate).getTime());
        Date end = new Date(dateFormat.parse(endDate).getTime());
        Date today =
                new Date(
                        dateFormat
                                .parse(dateFormat.format(new Date(System.currentTimeMillis())))
                                .getTime());

        return start.before(today) && end.after(today);
    }

    public static boolean checkDateDurationBefore(String startDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        Date start = new Date(dateFormat.parse(startDate).getTime());
        Date today =
                new Date(
                        dateFormat
                                .parse(dateFormat.format(new Date(System.currentTimeMillis())))
                                .getTime());

        return start.before(today);
    }

    public static boolean checkDateDurationAfter(String endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        Date end = new Date(dateFormat.parse(endDate).getTime());
        Date today =
                new Date(
                        dateFormat
                                .parse(dateFormat.format(new Date(System.currentTimeMillis())))
                                .getTime());

        return end.after(today);
    }
}
