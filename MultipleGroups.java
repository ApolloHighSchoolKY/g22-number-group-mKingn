public boolean contains(int cont){
    for(int i=0; i<groupList.size-1; i++){
        if(groupList[i] == cont)return true;
    }
    return false;
}
