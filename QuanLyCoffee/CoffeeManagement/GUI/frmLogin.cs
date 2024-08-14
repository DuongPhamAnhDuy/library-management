using System;
using System.Windows.Forms;


namespace CoffeeManagement.GUI
{
    public partial class frmLogin : DevExpress.XtraEditors.XtraForm
    {
        // tao delegate truyen thong tin den form main
        public delegate void SendData(string user, string password);
        public SendData sendData;

        public frmLogin(SendData _sendData)
        {
            DialogResult = DialogResult.Cancel;
            InitializeComponent();
            sendData = _sendData;
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            if (txtTaiKhoan.Text == "admin" && txtMatKhau.Text == "0000")
            {
                this.sendData(txtTaiKhoan.Text, txtMatKhau.Text);
                
                DialogResult = DialogResult.OK;
                this.Close();
            }
            else lbThongBao.Visible = true;
        }
    }
}