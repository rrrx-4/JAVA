int i = 1;
        while (arr1.get(arr1.size() - i) == arr2.get(arr2.size() - i)) {
            i++;
        }
        int lca = arr1.get(arr1.size() - i + 1);
        return lca;