int singleNumber(int* nums, int numsSize) {
    int first=nums[0];
    for(int i=1;i<numsSize;i++){
        first=first^nums[i];
    }
    return first;
}