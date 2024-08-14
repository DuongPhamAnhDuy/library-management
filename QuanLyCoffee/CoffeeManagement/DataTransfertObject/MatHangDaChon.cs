

namespace CoffeeManagement
{
    public class MatHangDaChon
    {
        public MatHang MatHang { get; set; }
        public int SoLuong { get; set; }
        public MatHangDaChon(MatHang MatHang, int SoLuong)
        {
            this.MatHang = MatHang;
            this.SoLuong = SoLuong;
        }
        public string[] GetInfo()
        {
            return new string[] { MatHang.ID, MatHang.TenMatHang, SoLuong.ToString(), (MatHang.Gia * SoLuong).ToString() };
        }
    }
}
