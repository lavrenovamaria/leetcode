package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0; // индекс последнего элемента массива без дубликатов
        if (nums.length == 0) {
            return 0;
        }
        // Проходим по массиву и сравниваем элементы
        // Если элементы не равны, то записываем в массив элементы без дубликатов
        // Если элементы равны, то записываем нули в массив
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                //nums[++i] потому что сначала инкрементируем i, а потом записываем в массив
                nums[++i] = nums[j];
            } else {
                nums[j] = 0;
            }
        }
        // Заполняем оставшиеся индексы нулями
        // k - длина массива без дубликатов
        // i - индекс последнего элемента массива без дубликатов
        // j - индекс текущего элемента массива
        for (int j = i + 1; j < nums.length; j++) {
            nums[j] = 0;
        }
        // Возвращаем длину массива без дубликатов
        // i + 1, потому что индексация начинается с 0
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray res = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        //System.out.println(res.isDuplicates(nums));
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = res.removeDuplicates(nums); // Calls your implementation
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
