namespace CoffeeManagement
{
    partial class frmSplashScreen
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.progressBarControl = new DevExpress.XtraEditors.MarqueeProgressBarControl();
            this.labelStatus = new DevExpress.XtraEditors.LabelControl();
            this.lbAppName = new System.Windows.Forms.Label();
            this.labelControl1 = new DevExpress.XtraEditors.LabelControl();
            ((System.ComponentModel.ISupportInitialize)(this.progressBarControl.Properties)).BeginInit();
            this.SuspendLayout();
            // 
            // progressBarControl
            // 
            this.progressBarControl.EditValue = 0;
            this.progressBarControl.Location = new System.Drawing.Point(49, 142);
            this.progressBarControl.Margin = new System.Windows.Forms.Padding(4);
            this.progressBarControl.Name = "progressBarControl";
            this.progressBarControl.Size = new System.Drawing.Size(464, 15);
            this.progressBarControl.TabIndex = 5;
            this.progressBarControl.UseWaitCursor = true;
            // 
            // labelStatus
            // 
            this.labelStatus.Location = new System.Drawing.Point(49, 111);
            this.labelStatus.Margin = new System.Windows.Forms.Padding(4);
            this.labelStatus.Name = "labelStatus";
            this.labelStatus.Size = new System.Drawing.Size(57, 16);
            this.labelStatus.TabIndex = 7;
            this.labelStatus.Text = "Starting...";
            this.labelStatus.UseWaitCursor = true;
            // 
            // lbAppName
            // 
            this.lbAppName.AutoSize = true;
            this.lbAppName.BackColor = System.Drawing.Color.White;
            this.lbAppName.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbAppName.ForeColor = System.Drawing.Color.OliveDrab;
            this.lbAppName.Location = new System.Drawing.Point(162, 29);
            this.lbAppName.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lbAppName.Name = "lbAppName";
            this.lbAppName.Size = new System.Drawing.Size(228, 31);
            this.lbAppName.TabIndex = 8;
            this.lbAppName.Text = " COFFEE SHOP";
            this.lbAppName.UseWaitCursor = true;
            this.lbAppName.Click += new System.EventHandler(this.lbAppName_Click);
            // 
            // labelControl1
            // 
            this.labelControl1.Location = new System.Drawing.Point(49, 210);
            this.labelControl1.Name = "labelControl1";
            this.labelControl1.Size = new System.Drawing.Size(134, 16);
            this.labelControl1.TabIndex = 9;
            this.labelControl1.Text = "TH QHTCSDL - NHÓM 5";
            this.labelControl1.UseWaitCursor = true;
            this.labelControl1.Click += new System.EventHandler(this.labelControl1_Click);
            // 
            // frmSplashScreen
            // 
            this.ActiveGlowColor = System.Drawing.Color.White;
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(549, 257);
            this.Controls.Add(this.labelControl1);
            this.Controls.Add(this.lbAppName);
            this.Controls.Add(this.labelStatus);
            this.Controls.Add(this.progressBarControl);
            this.InactiveGlowColor = System.Drawing.Color.White;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "frmSplashScreen";
            this.Text = "Form1";
            this.UseWaitCursor = true;
            ((System.ComponentModel.ISupportInitialize)(this.progressBarControl.Properties)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private DevExpress.XtraEditors.MarqueeProgressBarControl progressBarControl;
        private DevExpress.XtraEditors.LabelControl labelStatus;
        private System.Windows.Forms.Label lbAppName;
        private DevExpress.XtraEditors.LabelControl labelControl1;
    }
}
