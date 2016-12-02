static int binarysearch(String [] sorted, String x, int lo, int hi){
	if (lo > hi) return -1;
	int m = (lo + hi) /2;
	int cmp = x.compareTo(sorted[m]);
	if ( cmp < 0 ) return binarysearch(sorted, x , lo, m-1);
	else if ( cmp > 0) return binarysearch(sorted, x , m+1, hi);
	else return m;
}

