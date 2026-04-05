public class TilesRequired {
    public static void main(String args[]){
        double roomAreaSqM= 1434.0;
        double tileSizecm= 12.0;

        double areaOfTile= tileSizecm*tileSizecm/10000;
        double tilesRequired = roomAreaSqM / areaOfTile;

        int ceilTiles = (int) tilesRequired + (tilesRequired % 1 == 0 ? 0 : 1);



        System.out.println("Tiles Required for Flooring = "+ceilTiles+" units");
    }
}
