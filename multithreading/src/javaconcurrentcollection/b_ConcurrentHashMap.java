package javaconcurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * HashMap - Hash table [ ]
 *        T1,T2,T3-> no thread safe.
 * Hash table [ ] // only one thread is allowed to operate is thread safe.
 *                    but it create performance issue.
 *
 * for read operation no write opeartion is not required
 * so concurrent hash map works with bucket level locking.
 *
 * Segment locking total hashmap is divided into multiple segments
 * initial capacity - 16 and concurreny level - 16
 * defualt is 16.
 *
 *  Conclusion ->
 *  1. underlying DS is hashtable.
 *  2.  in concurrent hash map any read of operation are allowed
 *     but to update operation segments locks requires.
 *  3. Concurrent update by achieved by dividing concurrency level.
 *  4. null is not allowed.
 *  5. it doesnt throw concurrent modification exception.
 * */


/**
 * Synchronized HashMap - > we get concurrentmodification exception
 *                          only one thread is allowed to perform operation
 *                          null is allowed.
 *                          also in hashtable null is not allowed key and value
 *
 * */
public class b_ConcurrentHashMap extends  Thread{
 ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    ConcurrentHashMap concurrentHashMap1 = new ConcurrentHashMap(c);
    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
    ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();

 @Override
 public void run(){
     concurrentHashMap.put("a","1");
     concurrentHashMap.put("b","1");


     concurrentHashMap.replace("a","22");
     concurrentHashMap.put("c","1");
     concurrentHashMap.put("d","1");

 }

 /** Iterator is fail fast */
 /** in concurrent we cant provide null */
    public static void main(String[] args) {

    }

}
