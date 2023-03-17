package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        //создать массив строк для хранения результатов
        List<String> result = new ArrayList<>();
        //если строка пустая, то вернуть пустой массив
        if (digits == null || digits.length() == 0) {
            return result;
        }
        //рекурсивно вызвать функцию для генерации всех комбинаций
        //digits строка цифр, для которой мы генерируем комбинации.
        //map: отображение цифр в буквы
        //индекс: текущий индекс в строке цифр
        //current: текущая комбинация
        //result: массив строк для хранения результатов
        generateCombinations(digits, map, 0, "", result);
        return result;

    }
        private void generateCombinations(String digits, Map<Integer, String> map, int index, String current, List<String> result)
        {
            //если индекс достигает конца строки цифр, то добавить текущую комбинацию в массив строк для хранения результатов
            if (index == digits.length()) {
                result.add(current);
                return;
            }
            //получить все буквы, соответствующие текущей цифре
            String letters = map.get(digits.charAt(index) - '0');
            //перебрать все буквы
            for (int i = 0; i < letters.length(); i++) {
                //рекурсивно вызвать функцию для генерации всех комбинаций
                //идём на индекс + 1, добавляем букву к текущей комбинации
                generateCombinations(digits, map, index + 1, current + letters.charAt(i), result);
            }
        }


    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber result = new LetterCombinationsOfAPhoneNumber();
        System.out.println(result.letterCombinations(""));
    }
}
