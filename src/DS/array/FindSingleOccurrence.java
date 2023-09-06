package DS.array;
/*
Given an Array of N elements unsorted/sorted, every element is repeated twice except one, find the element which is not repeated
Note: The repeated numbers are always adjacent CORRECT INPUT:2233446778899, INOCRRECT INPUT:2933446778892
 */
public class FindSingleOccurrence {
    public static void main(String[] args) {
        FindSingleOccurrence singleOccourence = new FindSingleOccurrence();
        int arr[] = {2,2,3,3,4,4,6,7,7,9,9};
        System.out.println(FindSingleOccurrence.findSingleOccurrence(arr));
    }
    // Index     012345678910
    // Array     22334467799
    // INT 1: Akele Element k Left side me koi bhi element utha lo, uska joh First occourence hai wo hamesha EVEN INDEX me hoga
    // INT 2: Akele Element k Right side me koi bhi element utha lo, uska joh First occourence hai wo hamesha ODD INDEX me hoga
    public static int findSingleOccurrence(int arr[]){
            int low = 2;
            int high = arr.length-3;
            if(arr[0]!=arr[1]) {
                return arr[0];
            }
            if(arr[arr.length-1]!=arr[arr.length-2]) {
                return arr[arr.length-1];
            }
            while (low <=high) {
                int mid = low + high /2;
                // agar MID element ka ek RIGHT ya  MID ELEMENT ka left MID SAY
                // ALAG alag hai it means vo akela element hai,

                //  1122466, isme 4 k right aur 4 k left.  4 k barabar hai nahi to yehi akela ha
                //  Agar mid = 2, ko Akela maano, 2 k left to 1, that is fine, bur 2 kay right me 2 hi hai,
                //  then ye akela nhi h

                if(arr[mid]!=arr[mid-1] && arr[mid]!= arr[mid+1]) {
                    return  mid;
                }
                // AGAR Current MID, ELEMENT ki second Frequency par hai toh Mid ko first frequency par le aao, mid -- kar k
                if(arr[mid] == arr[mid-1]) {
                    mid --;

                    // INT 1: YAAD karo!!!  AKELE ELEMENT k LEFT SIDE WALE SPACE ka koi bhi element ka first occurence ka INDEX always EVEN hota hai
                    if (mid %2 ==0) {
                        // JO BHI ELEMENT MID HAI, USKO humne upar, first FREQUENCY PAR SET KI hai aur uska index agar EVEN  hai
                        // isse ye pta lag gaya MID k left side jitne bhi element hain sab pair me hain
                        // TOH LEft side ko search space say discard kar do.
                        low = mid +2; // Bez mid+1 to wohi elemnt repeat hoga since pair me h


                    } else {
                        // INT 2: YAAD karo!!!  AKELE ELEMENT k RIGHT SIDE WALE SPACE ka koi bhi element ka first occurence ka INDEX always ODD hota hai


                        // JO BHI ELEMENT MID HAI, USKO humne upar, first FREQUENCY PAR SET KI hai aur uska index agar ODD hai
                        // isse ye pta lag gaya MID k RIGHT side jitne bhi element hain unme say ksi bhi element ki FIRST OCC odd hi hogi, which means
                        // AKELA BANDA LEFT side par hai
                        // TOH RIGHT side ko search space say discard kar do.
                        high = mid -1;

                    }

                } else {
                    //Likho na likho koi baat nhi, becz MID , element ki first Frequecy par hoga hi ELSE CASE ME
                }



            }
            return -1;
    }
}
