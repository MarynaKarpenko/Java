package de.telran;
// Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным,
// используя StringBuilder.
// Если значение null, то параметр не должен попадать в запрос.
// {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}

import java.util.HashMap;
import java.util.Map;

// Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
// Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';
public class Task2 {
    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<>();
        params.put("model", "V-60");
        params.put("country", "Germany");
        params.put("city", "Berlin");
        params.put("year", null);
        params.put("active", true);

        String sqlQuery = buildSqlQuery("cars", params);
        System.out.println(sqlQuery);
    }

    public static String buildSqlQuery(String tableName, Map<String, Object> params) {
        StringBuilder query = new StringBuilder("SELECT * FROM " + tableName + " WHERE ");

        boolean firstParam = true;
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value != null) {
                if (!firstParam) {
                    query.append(" AND ");
                } else {
                    firstParam = false;
                }

                if (value instanceof String) {
                    query.append(key).append(" = '").append(value).append("'");
                } else {
                    query.append(key).append(" = ").append(value);
                }
            }
        }
        return query.toString();
    }
}
