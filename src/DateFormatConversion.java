public class DateFormatConversion {

    public static void main(String[] args) {
        // Define an array of date strings in "month/day/year" format
        String[] dates = {
            "10/29/99", "12/5/01", "1/1/00", "4/15/98", "3/7/97", 
            "7/21/02", "9/12/03", "11/30/95", "5/5/94", "8/19/93"
        };

        // Loop through each date string and convert it to the desired format
        for (String date : dates) {
            String formattedDate = convertDateFormat(date);
            System.out.println(formattedDate);
        }
    }

    // Method to convert "month/day/year" to "dayth Month year"
    public static String convertDateFormat(String date) {
        // Split the input date string into month, day, and year
        String[] parts = date.split("/");

        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Convert year to four digits (assuming year in the format 99 -> 1999, 01 -> 2001)
        year = (year < 50) ? 2000 + year : 1900 + year;

        // Get the name of the month
        String monthName = getMonthName(month);

        // Convert day to ordinal (e.g., 1st, 2nd, 3rd, etc.)
        String dayWithSuffix = addDaySuffix(day);

        // Return the date in the desired format
        return dayWithSuffix + " " + monthName + " " + year;
    }

    // Method to return the month name based on the month number
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Subtract 1 since array index starts from 0
    }

    // Method to add the appropriate suffix to the day (e.g., 1st, 2nd, 3rd, etc.)
    public static String addDaySuffix(int day) {
        if (day >= 11 && day <= 13) {
            return day + "th"; // Special case for 11th, 12th, 13th
        }
        switch (day % 10) {
            case 1: return day + "st";
            case 2: return day + "nd";
            case 3: return day + "rd";
            default: return day + "th";
        }
    }
}
