//package com.example.demo.semanticTraining;
//
//public class SentimentAnalyzer {
//
//    public TweetWithSentiment findSentiment(String line) {
//
//        Properties props = new Properties();
//        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
//        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//        int mainSentiment = 0;
//        if (line != null && line.length() > 0) {
//            int longest = 0;
//            Annotation annotation = pipeline.process(line);
//            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
//                Tree tree = sentence.get(SentimentCoreAnnotations.AnnotatedTree.class);
//                int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
//                String partText = sentence.toString();
//                if (partText.length() > longest) {
//                    mainSentiment = sentiment;
//                    longest = partText.length();
//                }
//
//            }
//        }
//        if (mainSentiment == 2 || mainSentiment > 4 || mainSentiment < 0) {
//            return null;
//        }
//        TweetWithSentiment tweetWithSentiment = new TweetWithSentiment(line, toCss(mainSentiment));
//        return tweetWithSentiment;
//
//    }
//}