/****



 */


 1. Why we use serialVersionUID in java class ?
 =>
    As per java docs, during serialization, runtime associates with each serializable class a version number, called 
    a serialVersionUID, which is used during de-serialization to verify that the sender and receiver of a serialized 
    object have loaded classes for that object that are compatible with respect to serialization.