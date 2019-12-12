        ArrayList<String> arrL = new ArrayList<String>();

        arrL.add("aa");
        arrL.add("aa");
        arrL.add("aa");
        arrL.add("aa");
        arrL.add("aa");
        arrL.add("bb");
        arrL.add("bb");
        arrL.add("bb");
        arrL.add("bb");
        arrL.add("cc");
        arrL.add("cc");
        arrL.add("cc");
        arrL.add("cc");
        arrL.add("dd");
        arrL.add("dd");
        arrL.add("dd");
        arrL.add("ee");
        arrL.add("ee");
        arrL.add("ee");
        arrL.add("ee");
        arrL.add("ee");
        arrL.add("ee");

        System.out.println("arrL.size() = " + arrL.size());

        //Java 8 api
        // Create the list with duplicates.
//        List<String> listAll = Arrays.asList("CO2", "CH4", "SO2", "CO2", "CH4", "SO2", "CO2", "CH4", "SO2");
//
//      // Create a list with the distinct elements using stream.
//        List<String> listDistinct = listAll.stream().distinct().collect(Collectors.toList());

        List<String> arrDistinct = arrL.stream().distinct().collect(Collectors.toList());

        System.out.println("arrDistinct = " + arrDistinct);

        List<MessagesUnique> uni = new ArrayList<MessagesUnique>();

        List<Messages> m = messageDao.findAll();
        Long loggedInUserId = 1L;

        for(Messages msg : m) {
            if (msg.getRecipient_user_id() != loggedInUserId) {
                uni.add(new MessagesUnique(msg.getRecipient_user_id(), userDao.findUserById((long) msg.getRecipient_user_id()).getUsername(), msg.getLast_updated()));
            } else if (msg.getAuthor_user_id() != loggedInUserId) {
                uni.add(new MessagesUnique(msg.getRecipient_user_id(), userDao.findUserById((long) msg.getRecipient_user_id()).getUsername(), msg.getLast_updated()));
            }
        }

        System.out.println("uni.size() = " + uni.size());
    }