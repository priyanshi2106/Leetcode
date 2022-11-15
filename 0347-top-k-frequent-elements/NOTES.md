Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
// transfer results from list to int[];
int[] res = new int[k];
for (int i = 0; i < k; i++) res[i] = list.get(i);
return res;