package javaconcurrentcollection;

/**
 * Concurrent Collection -> why we should go for it?
 * -> several collection are not thread safe.
 *    (i). Data inconsistency.
 *    Vector, HashTable, Collection.SynchronizedList().
 *    (ii). Only one thread is allowed to work,even for read it create problem
 *    (iii). Iterating collection and one doing changes we get ConcurrentModification exception.
 *    to overcome these problems we use concurrent collection 1,5 java.
 *
 *    Concurrent collection
 *    (i). Thread safe.
 *    (ii). Performance wise very because different locking mechanism.
 *    (iii). Traditonal collection doest not work with scalable and big apps.
 *    (iv). ConcurrentHashMap.
 * */
public class p_CollectionThreads {
}
