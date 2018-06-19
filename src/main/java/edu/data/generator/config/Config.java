package edu.data.generator.config;

public interface Config {
    String SOURCE_DIR = "./dataset/cards";
    String BACKGROUND_DIR = "./dataset/backgrounds";
    String TARGET_DIR = "./dataset/output";
    String DATASET_DIR = "/VOCDataSet/";
    String IMAGES_DIR = "/JPEGImages/";
    String ANNOTATIONS_DIR = "/Annotations/";
    String DARKNET_LABELS = "/labels/";
    String DARKNET_CONFIG_DIR = "/DarknetConf/";
    String VOC_LABELS = "/VOCLabels/";
    Integer IMAGE_WIDTH = 800;
    Integer IMAGE_HEIGHT = 400;
    Integer ROWS = 1;
    Integer COLS = 1;
    Integer DATA_SET_SIZE = 5000;
    Integer VAL_SET_SIZE = 50;
    Integer MARGIN_AROUND = 10; // 10px space around the playground
    Integer MARGIN_BETWEEN = 10; // 10px space between the cards
    Integer MAX_ANGLE_TO_ROTATE = 30;
    boolean BLUR = true;
    boolean DEBUG = false;
    boolean DARKNET = true; // Generates labels and train-val.txt for darknet
    String[] CLASS_LABELS = {"cards"};
}
