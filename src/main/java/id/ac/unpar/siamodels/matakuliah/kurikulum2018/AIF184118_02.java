package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Pemrograman Sistem", sks = 2)
public class AIF184118_02 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasLulusKuliah("AIF181100-04")) {
            reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF183101-03");
            ok = false;
        }
        if (!mahasiswa.hasTempuhKuliah("AIF182206-03")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF183100-03");
            ok = false;
        }
        return ok;
    }
}
