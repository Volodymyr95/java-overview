package com.perfectial;

public class StringBlocks {

    public static void main(String[] args) {
        String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;

        String query = """
               SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
               WHERE `CITY` = 'NEW DEHLI'
               ORDER BY `EMP_ID`, `LAST_NAME`;
               """;
    }
}
