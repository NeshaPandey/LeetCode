class MaximumDistance {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxDistance = 0;
        
        // Initialize variables to track the smallest and largest elements
        int minElement = arrays.get(0).get(0);
        int maxElement = arrays.get(0).get(arrays.get(0).size() - 1);

        // Iterate through each array starting from the second array
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            
            // Get the first and last elements of the current array
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);
            
            // Calculate the maximum possible distance between the current array and the previously tracked arrays
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - minElement));
            maxDistance = Math.max(maxDistance, Math.abs(maxElement - currentMin));
            
            // Update the global minElement and maxElement
            minElement = Math.min(minElement, currentMin);
            maxElement = Math.max(maxElement, currentMax);
        }

        return maxDistance;
    }
    
}
