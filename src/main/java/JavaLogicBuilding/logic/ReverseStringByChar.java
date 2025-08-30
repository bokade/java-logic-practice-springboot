package JavaLogicBuilding.logic;

public class ReverseStringByChar {

    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] arr = str.toCharArray();

        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + new String(arr));
    }

}
